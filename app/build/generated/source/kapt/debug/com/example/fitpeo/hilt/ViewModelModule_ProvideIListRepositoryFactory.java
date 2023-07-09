// Generated by Dagger (https://dagger.dev).
package com.example.fitpeo.hilt;

import android.content.Context;
import com.example.fitpeo.data.repository.remote.AlbumDataSource;
import com.example.fitpeo.domain.repository.AlbumListRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelModule_ProvideIListRepositoryFactory implements Factory<AlbumListRepository> {
  private final ViewModelModule module;

  private final Provider<AlbumDataSource> dataSourceProvider;

  private final Provider<Context> contextProvider;

  public ViewModelModule_ProvideIListRepositoryFactory(ViewModelModule module,
      Provider<AlbumDataSource> dataSourceProvider, Provider<Context> contextProvider) {
    this.module = module;
    this.dataSourceProvider = dataSourceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AlbumListRepository get() {
    return provideIListRepository(module, dataSourceProvider.get(), contextProvider.get());
  }

  public static ViewModelModule_ProvideIListRepositoryFactory create(ViewModelModule module,
      Provider<AlbumDataSource> dataSourceProvider, Provider<Context> contextProvider) {
    return new ViewModelModule_ProvideIListRepositoryFactory(module, dataSourceProvider, contextProvider);
  }

  public static AlbumListRepository provideIListRepository(ViewModelModule instance,
      AlbumDataSource dataSource, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideIListRepository(dataSource, context));
  }
}
