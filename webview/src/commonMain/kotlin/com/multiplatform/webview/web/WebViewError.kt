package com.multiplatform.webview.web

import androidx.compose.runtime.Immutable

/**
 * Created By Kevin Zou On 2023/9/5
 */

/**
 * A wrapper class to hold errors from the WebView.
 */
@Immutable
data class WebViewError(
    /**
     * The request the error came from.
     */
    val code: Int,
    /**
     * The error that was reported.
     */
    val description: String,
    /**
     * Is the error related to a request from the main frame?
     */
    val isFromMainFrame: Boolean,
)
