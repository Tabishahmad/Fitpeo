//package com.example.fitpeo.presentation.list
//
//import androidx.test.core.app.ActivityScenario
//import androidx.test.espresso.Espresso
//import androidx.test.espresso.IdlingRegistry
//import androidx.test.espresso.IdlingResource
//import androidx.test.espresso.assertion.ViewAssertions.matches
//import androidx.test.espresso.contrib.RecyclerViewActions
//import androidx.test.espresso.idling.CountingIdlingResource
//import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
//import androidx.test.espresso.matcher.ViewMatchers.withId
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import com.example.fitpeo.R
//import com.example.fitpeo.presentation.FragmentContainerActivity
//import org.junit.After
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//
//@RunWith(AndroidJUnit4::class)
//class ImageListAdapterTest {
//
//    private lateinit var idlingResource: IdlingResource
//
//    @Before
//    fun setUp() {
//        // Launch the activity
//        val activityScenario = ActivityScenario.launch(FragmentContainerActivity::class.java)
//    }
//
//    @After
//    fun tearDown() {
//        // Unregister the IdlingResource
//        IdlingRegistry.getInstance().unregister(idlingResource)
//    }
//
//    @Test
//    fun testImageListAdapter() {
//        // Delay for initial loading
//        Espresso.onView(withId(R.id.progressBar)).check(matches(isDisplayed()))
//        Thread.sleep(2000)
//
//        // Verify that the list is displayed
//        Espresso.onView(withId(R.id.rv)).check(matches(isDisplayed()))
//
//        // Perform a click on the first item
//        Espresso.onView(withId(R.id.rv)).perform(RecyclerViewActions.actionOnItemAtPosition<ImageListAdapter.ImageHolder>(0, click()))
//
//        // Verify that the detail screen is displayed
//        Espresso.onView(withId(R.id.imageView)).check(matches(isDisplayed()))
//    }
//
//    private fun FragmentContainerActivity.getIdlingResource(): IdlingResource {
//        val idlingResource = CountingIdlingResource("FragmentContainerActivityIdlingResource")
//
//        // Increment the counter when starting a task
//        idlingResource.increment()
//
//        // Implement your logic to determine the idle state
//        // For example, if your task is asynchronous, decrement the counter when it's completed
//
//        return idlingResource
//    }
//
//
//    companion object {
//        private const val TEST_ALBUM_ID = 1
//        private const val TEST_ALBUM_TITLE = "Test Album"
//        private const val TEST_ALBUM_URL = "http://example.com/image.jpg"
//        private const val TEST_ALBUM_THUMBNAIL_URL = "http://example.com/thumbnail.jpg"
//        private const val TEST_ALBUM_IS_FAVORITE = true
//        private const val TEST_ALBUM_POSITION = 0
//    }
//}
