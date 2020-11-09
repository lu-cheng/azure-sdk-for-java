// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties required to create an endpoint. */
@Fluent
public final class EndpointProperties extends EndpointPropertiesUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointProperties.class);

    /*
     * The host name of the endpoint structured as {endpointName}.{DNSZone},
     * e.g. contoso.azureedge.net
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The source of the content being delivered via CDN.
     */
    @JsonProperty(value = "origins", required = true)
    private List<DeepCreatedOrigin> origins;

    /*
     * The origin groups comprising of origins that are used for load balancing
     * the traffic based on availability.
     */
    @JsonProperty(value = "originGroups")
    private List<DeepCreatedOriginGroup> originGroups;

    /*
     * Resource status of the endpoint.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointResourceState resourceState;

    /*
     * Provisioning status of the endpoint.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN.
     *
     * @return the origins value.
     */
    public List<DeepCreatedOrigin> origins() {
        return this.origins;
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN.
     *
     * @param origins the origins value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withOrigins(List<DeepCreatedOrigin> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the originGroups property: The origin groups comprising of origins that are used for load balancing the
     * traffic based on availability.
     *
     * @return the originGroups value.
     */
    public List<DeepCreatedOriginGroup> originGroups() {
        return this.originGroups;
    }

    /**
     * Set the originGroups property: The origin groups comprising of origins that are used for load balancing the
     * traffic based on availability.
     *
     * @param originGroups the originGroups value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withOriginGroups(List<DeepCreatedOriginGroup> originGroups) {
        this.originGroups = originGroups;
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the endpoint.
     *
     * @return the resourceState value.
     */
    public EndpointResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the endpoint.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withOriginPath(String originPath) {
        super.withOriginPath(originPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withContentTypesToCompress(List<String> contentTypesToCompress) {
        super.withContentTypesToCompress(contentTypesToCompress);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withOriginHostHeader(String originHostHeader) {
        super.withOriginHostHeader(originHostHeader);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withIsCompressionEnabled(Boolean isCompressionEnabled) {
        super.withIsCompressionEnabled(isCompressionEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withIsHttpAllowed(Boolean isHttpAllowed) {
        super.withIsHttpAllowed(isHttpAllowed);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withIsHttpsAllowed(Boolean isHttpsAllowed) {
        super.withIsHttpsAllowed(isHttpsAllowed);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withQueryStringCachingBehavior(QueryStringCachingBehavior queryStringCachingBehavior) {
        super.withQueryStringCachingBehavior(queryStringCachingBehavior);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withOptimizationType(OptimizationType optimizationType) {
        super.withOptimizationType(optimizationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withProbePath(String probePath) {
        super.withProbePath(probePath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withGeoFilters(List<GeoFilter> geoFilters) {
        super.withGeoFilters(geoFilters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withDefaultOriginGroup(ResourceReference defaultOriginGroup) {
        super.withDefaultOriginGroup(defaultOriginGroup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withUrlSigningKeys(List<UrlSigningKey> urlSigningKeys) {
        super.withUrlSigningKeys(urlSigningKeys);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withDeliveryPolicy(EndpointPropertiesUpdateParametersDeliveryPolicy deliveryPolicy) {
        super.withDeliveryPolicy(deliveryPolicy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EndpointProperties withWebApplicationFirewallPolicyLink(
        EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        super.withWebApplicationFirewallPolicyLink(webApplicationFirewallPolicyLink);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (origins() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property origins in model EndpointProperties"));
        } else {
            origins().forEach(e -> e.validate());
        }
        if (originGroups() != null) {
            originGroups().forEach(e -> e.validate());
        }
    }
}
