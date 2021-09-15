package com.vk.api.sdk.queries.leadforms;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leadforms.responses.CreateResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for LeadForms.create method
 */
public class LeadFormsCreateQuery extends AbstractQueryBuilder<LeadFormsCreateQuery, CreateResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     * @param name value of "name" parameter.
     * @param title value of "title" parameter.
     * @param description value of "description" parameter.
     * @param questions value of "questions" parameter.
     * @param policyLinkUrl value of "policy link url" parameter.
     */
    public LeadFormsCreateQuery(VkApiClient client, UserActor actor, int groupId, String name,
            String title, String description, String questions, String policyLinkUrl) {
        super(client, "leadForms.create", CreateResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        name(name);
        title(title);
        description(description);
        questions(questions);
        policyLinkUrl(policyLinkUrl);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsCreateQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set name
     *
     * @param value value of "name" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsCreateQuery name(String value) {
        return unsafeParam("name", value);
    }

    /**
     * Set title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsCreateQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Set description
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsCreateQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Set questions
     *
     * @param value value of "questions" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsCreateQuery questions(String value) {
        return unsafeParam("questions", value);
    }

    /**
     * Set policy link url
     *
     * @param value value of "policy link url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsCreateQuery policyLinkUrl(String value) {
        return unsafeParam("policy_link_url", value);
    }

    /**
     * Set photo
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Set confirmation
     *
     * @param value value of "confirmation" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery confirmation(String value) {
        return unsafeParam("confirmation", value);
    }

    /**
     * Set site link url
     *
     * @param value value of "site link url" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery siteLinkUrl(String value) {
        return unsafeParam("site_link_url", value);
    }

    /**
     * Set active
     *
     * @param value value of "active" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery active(Boolean value) {
        return unsafeParam("active", value);
    }

    /**
     * Set once per user
     *
     * @param value value of "once per user" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery oncePerUser(Boolean value) {
        return unsafeParam("once_per_user", value);
    }

    /**
     * Set pixel code
     *
     * @param value value of "pixel code" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery pixelCode(String value) {
        return unsafeParam("pixel_code", value);
    }

    /**
     * notify_admins
     * Set notify admins
     *
     * @param value value of "notify admins" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery notifyAdmins(Integer... value) {
        return unsafeParam("notify_admins", value);
    }

    /**
     * Set notify admins
     *
     * @param value value of "notify admins" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery notifyAdmins(List<Integer> value) {
        return unsafeParam("notify_admins", value);
    }

    /**
     * notify_emails
     * Set notify emails
     *
     * @param value value of "notify emails" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery notifyEmails(String... value) {
        return unsafeParam("notify_emails", value);
    }

    /**
     * Set notify emails
     *
     * @param value value of "notify emails" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public LeadFormsCreateQuery notifyEmails(List<String> value) {
        return unsafeParam("notify_emails", value);
    }

    @Override
    protected LeadFormsCreateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("policy_link_url", "group_id", "name", "questions", "title", "description", "access_token");
    }
}