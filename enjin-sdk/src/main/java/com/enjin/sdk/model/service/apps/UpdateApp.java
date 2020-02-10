package com.enjin.sdk.model.service.apps;

import com.enjin.sdk.graphql.GraphQLRequest;

public class UpdateApp extends GraphQLRequest<UpdateApp> {

    public UpdateApp id(Integer id) {
        withParameter("id", id);
        return this;
    }

    public UpdateApp name(String name) {
        withParameter("name", name);
        return this;
    }

    public UpdateApp description(String description) {
        withParameter("description", description);
        return this;
    }

    public UpdateApp image(String image) {
        withParameter("image", image);
        return this;
    }

    public UpdateApp generateSecret(boolean secret) {
        withParameter("secret", secret);
        return this;
    }

    public UpdateApp revokeSecret(boolean revoke) {
        withParameter("revoke", revoke);
        return this;
    }

}
