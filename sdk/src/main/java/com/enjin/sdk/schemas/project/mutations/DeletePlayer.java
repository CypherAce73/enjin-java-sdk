package com.enjin.sdk.schemas.project.mutations;

import com.enjin.sdk.graphql.GraphQLRequest;

/**
 * TODO
 */
public class DeletePlayer extends GraphQLRequest<DeletePlayer> {

    /**
     * TODO
     */
    public DeletePlayer() {
        super("enjin.sdk.project.DeletePlayer");
    }

    /**
     * TODO
     * @param id
     * @return
     */
    public DeletePlayer id(String id) {
        return set("id", id);
    }

}