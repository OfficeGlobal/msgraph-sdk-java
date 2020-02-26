// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplicationRequest;
import com.microsoft.graph.requests.extensions.IExtensionPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationStreamRequestBuilder;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IApplicationAddKeyRequestBuilder;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.requests.extensions.IApplicationAddPasswordRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRemoveKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRemovePasswordRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Request Builder.
 */
public interface IApplicationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IApplicationRequest instance
     */
    IApplicationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IApplicationRequest instance
     */
    IApplicationRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IExtensionPropertyCollectionRequestBuilder extensionProperties();

    IExtensionPropertyRequestBuilder extensionProperties(final String id);

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf();

    IDirectoryObjectCollectionWithReferencesRequestBuilder owners();

    IDirectoryObjectWithReferenceRequestBuilder owners(final String id);

    IApplicationStreamRequestBuilder logo();
    IApplicationAddKeyRequestBuilder addKey(final KeyCredential keyCredential, final PasswordCredential passwordCredential, final String proof);
    IApplicationAddPasswordRequestBuilder addPassword(final PasswordCredential passwordCredential);
    IApplicationRemoveKeyRequestBuilder removeKey(final java.util.UUID keyId, final String proof);
    IApplicationRemovePasswordRequestBuilder removePassword(final java.util.UUID keyId);

}
