/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import rx.Observable;

/**
 * Type representing PartitionKeyRangeIdRegions.
 */
public interface PartitionKeyRangeIdRegions {
    /**
     * Retrieves the metrics determined by the given filter for the given partition key range id and region.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param partitionKeyRangeId Partition Key Range Id for which to get data.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PartitionMetric> listMetricsAsync(String resourceGroupName, String accountName, String region, String databaseRid, String collectionRid, String partitionKeyRangeId, String filter);

}