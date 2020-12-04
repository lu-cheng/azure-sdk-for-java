/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01;

import rx.Observable;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.ReplicasInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Replicas.
 */
public interface Replicas extends HasInner<ReplicasInner> {
    /**
     * List all the replicas for a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerServer> listByServerAsync(String resourceGroupName, String serverName);

}
