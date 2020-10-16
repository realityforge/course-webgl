package org.realityforge.webgl.util;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

final class AppStateHolder
{
  @Nullable
  private static AppState c_appState;

  static void inAppState( @Nonnull final AppState appState, @Nonnull final AppState.Action action )
  {
    final AppState current = c_appState;
    try
    {
      c_appState = appState;
      action.run();
    }
    finally
    {
      c_appState = current;
    }
  }

  @Nonnull
  static AppState getAppState()
  {
    assert null != c_appState;
    return c_appState;
  }
}
