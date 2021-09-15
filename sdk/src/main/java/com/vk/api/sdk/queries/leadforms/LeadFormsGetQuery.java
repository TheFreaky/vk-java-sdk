package com.vk.api.sdk.queries.leadforms;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leadforms.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for LeadForms.get method
 */
public class LeadFormsGetQuery extends AbstractQueryBuilder<LeadFormsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     * @param formId value of "form id" parameter.
     */
    public LeadFormsGetQuery(VkApiClient client, UserActor actor, int groupId, int formId) {
        super(client, "leadForms.get", GetResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        formId(formId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsGetQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set form id
     *
     * @param value value of "form id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsGetQuery formId(int value) {
        return unsafeParam("form_id", value);
    }

    @Override
    protected LeadFormsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "form_id", "access_token");
    }
}