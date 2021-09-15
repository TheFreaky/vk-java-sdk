package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.groups.Fields;
import com.vk.api.sdk.objects.groups.responses.GetByIdObjectLegacyResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getById method
 */
public class GroupsGetByIdQueryWithObjectLegacy extends AbstractQueryBuilder<GroupsGetByIdQueryWithObjectLegacy, List<GetByIdObjectLegacyResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsGetByIdQueryWithObjectLegacy(VkApiClient client, UserActor actor) {
        super(client, "groups.getById", Utils.buildParametrizedType(List.class, GetByIdObjectLegacyResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsGetByIdQueryWithObjectLegacy(VkApiClient client, GroupActor actor) {
        super(client, "groups.getById", Utils.buildParametrizedType(List.class, GetByIdObjectLegacyResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GroupsGetByIdQueryWithObjectLegacy(VkApiClient client, ServiceActor actor) {
        super(client, "groups.getById", Utils.buildParametrizedType(List.class, GetByIdObjectLegacyResponse.class));
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    /**
     * ID or screen name of the community.
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQueryWithObjectLegacy groupId(String value) {
        return unsafeParam("group_id", value);
    }

    /**
     * group_ids
     * IDs or screen names of communities.
     *
     * @param value value of "group ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQueryWithObjectLegacy groupIds(String... value) {
        return unsafeParam("group_ids", value);
    }

    /**
     * IDs or screen names of communities.
     *
     * @param value value of "group ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQueryWithObjectLegacy groupIds(List<String> value) {
        return unsafeParam("group_ids", value);
    }

    /**
     * fields
     * Group fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQueryWithObjectLegacy fields(Fields... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Group fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetByIdQueryWithObjectLegacy fields(List<Fields> value) {
        return unsafeParam("fields", value);
    }

    @Override
    protected GroupsGetByIdQueryWithObjectLegacy getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}