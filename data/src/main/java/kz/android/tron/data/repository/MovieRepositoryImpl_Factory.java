// Generated by Dagger (https://dagger.dev).
package kz.android.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kz.android.data.network.ApiService;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieRepositoryImpl_Factory implements Factory<MovieRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public MovieRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public MovieRepositoryImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static MovieRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new MovieRepositoryImpl_Factory(apiServiceProvider);
  }

  public static MovieRepositoryImpl newInstance(ApiService apiService) {
    return new MovieRepositoryImpl(apiService);
  }
}