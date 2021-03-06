// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsRoundUpRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Round Up Request Builder.
 */
public interface IWorkbookFunctionsRoundUpRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsRoundUpRequest
     *
     * @return the IWorkbookFunctionsRoundUpRequest instance
     */
    IWorkbookFunctionsRoundUpRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsRoundUpRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsRoundUpRequest instance
     */
    IWorkbookFunctionsRoundUpRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
