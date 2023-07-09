package com.example.fitpeo.presentation.list

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fitpeo.R
import com.example.fitpeo.common.*
import com.example.fitpeo.databinding.FragmentBookListBinding
import com.example.fitpeo.domain.model.Album
import com.example.fitpeo.presentation.core.ViewState
import com.example.fitpeo.presentation.core.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AlbumListFragment : BaseFragment<AlbumListViewModel,FragmentBookListBinding>(
    R.layout.fragment_book_list
),ImageListAdapter.ItemClickListener {
    override val viewModel: AlbumListViewModel by activityViewModels()

    override fun init() {
        setHasOptionsMenu(true)
        viewModel.fetchList()
    }
    private fun hideProgressBar(){
        binding.progressBar.hide()
    }
    private fun showProgressBar(){
        binding.progressBar.show()
    }
    private fun setupRecyclersView(list:List<Album>){
        hideProgressBar()
        binding.rv.layoutManager = GridLayoutManager(requireContext(), 3)
        binding.rv.setData(list)
        binding.rv.setItemClickListener(this)
    }

    override fun onItemClick(view: View, any: Any, index: Int) {
        navigateToDetail(any as Album)
    }
    private fun navigateToDetail(album: Album){
        val b = Bundle()
        b.putParcelable(ALBUM_OBJ,album)
        findNavController().navigate(R.id.bookDetailFragment,b)
    }
    private fun navigateToFavourite(){
        findNavController().navigate(R.id.favBookFragment)
    }

    override fun observeViewModel() {
        performCoroutineTask {
            viewModel.getviewStateFlow().collect{ viewState->
                when(viewState){
                    is ViewState.Loading ->
                        showProgressBar()
                    is ViewState.Success -> {
                        setupRecyclersView(viewState.result)
                    }
                    is ViewState.Failure -> {
                        hideProgressBar()
                        viewState.failMessage.let {
                            it.showCustomToast(requireContext())
                        }
                    }
                }
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.list_menu_fragment, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_favorite -> {
                navigateToFavourite()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}