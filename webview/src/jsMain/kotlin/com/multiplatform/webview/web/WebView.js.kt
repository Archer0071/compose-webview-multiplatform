package com.multiplatform.webview.web

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.multiplatform.webview.jsbridge.WebViewJsBridge

/**
 * Expect API of [WebView] that is implemented in the platform-specific modules.
 */
@Composable
actual fun ActualWebView(
    state: WebViewState,
    modifier: Modifier,
    payload: String?,
    captureBackPresses: Boolean,
    navigator: WebViewNavigator,
    webViewJsBridge: WebViewJsBridge?,
    onCreated: (NativeWebView) -> Unit,
    onDispose: (NativeWebView) -> Unit,
    platformWebViewParams: PlatformWebViewParams?,
    factory: (WebViewFactoryParam) -> NativeWebView
) {
}

/**
 * Platform specific default WebView factory function. This can be called from
 * a custom factory function for any platforms that don't need to be customized.
 */
actual fun defaultWebViewFactory(param: WebViewFactoryParam): NativeWebView {
    TODO("Not yet implemented")
}

/**
 * Platform specific parameters given to the WebView composable function:
 *   - On Android, this contains an optional `AccompanistWebViewClient` and `AccompanistWebChromeClient`
 *   - On iOS, this is currently unused
 *   - On Desktop, this is currently unused
 */
actual class PlatformWebViewParams

/**
 * Platform specific parameters given to the WebView factory function. This is a
 * data class containing one or more platform-specific values necessary to
 * create a platform-specific WebView:
 *   - On Android, this contains a `Context` object
 *   - On iOS, this contains a `WKWebViewConfiguration` object created from the
 *     provided WebSettings
 *   - On Desktop, this contains the WebViewState, the KCEFClient, and the
 *     loaded file content (if a file, otherwise, an empty string)
 */
actual class WebViewFactoryParam