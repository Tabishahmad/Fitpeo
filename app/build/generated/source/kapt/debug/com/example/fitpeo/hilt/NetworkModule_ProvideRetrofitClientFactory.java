// Generated by Dagger (https://dagger.dev).
package com.example.fitpeo.hilt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitClientFactory implements Factory<Retrofit> {
  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  public NetworkModule_ProvideRetrofitClientFactory(
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofitClient(gsonConverterFactoryProvider.get());
  }

  public static NetworkModule_ProvideRetrofitClientFactory create(
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    return new NetworkModule_ProvideRetrofitClientFactory(gsonConverterFactoryProvider);
  }

  public static Retrofit provideRetrofitClient(GsonConverterFactory gsonConverterFactory) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRetrofitClient(gsonConverterFactory));
  }
}
