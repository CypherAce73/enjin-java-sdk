package com.enjin.sdk.model.service.requests;

import java.util.List;

import com.enjin.sdk.model.service.PaginationRequest;
import com.enjin.sdk.service.requests.RequestsService;

/**
 * A builder for requests from the Trusted platform.
 *
 * @author Evan Lindsay
 * @see RequestsService
 */
public class GetRequests extends PaginationRequest<GetRequests> {

    /**
     * The request id.
     *
     * @param requestId the request id.
     *
     * @return the builder.
     */
    public GetRequests requestId(int requestId) {
        withParameter("id", requestId);
        return this;
    }

    /**
     * The blockchain transaction id.
     *
     * @param transactionId the transaction id.
     *
     * @return the builder.
     */
    public GetRequests transactionId(String transactionId) {
        withParameter("transactionId", transactionId);
        return this;
    }

    /**
     * The identity id.
     *
     * @param identityId the identity id.
     *
     * @return the builder.
     */
    public GetRequests identityId(int identityId) {
        withParameter("identityId", identityId);
        return this;
    }

    /**
     * The transaction type.
     *
     * @param type the transaction type.
     *
     * @return the builder.
     */
    public GetRequests transactionType(TransactionType type) {
        withParameter("type", type);
        return this;
    }

    /**
     * The recipients identity id.
     *
     * @param recipientId the recipients identity id.
     *
     * @return the builder.
     */
    public GetRequests recipientId(int recipientId) {
        withParameter("recipientId", recipientId);
        return this;
    }

    /**
     * The recipients ethereum address.
     *
     * @param recipientAddress the recipients ethereum address.
     *
     * @return the builder.
     */
    public GetRequests recipientAddress(String recipientAddress) {
        withParameter("recipientAddress", recipientAddress);
        return this;
    }

    /**
     * The sender or recipients identity id.
     *
     * @param senderOrRecipientId the sender or recipients identity id.
     *
     * @return the builder.
     */
    public GetRequests senderOrRecipientIdentity(int senderOrRecipientId) {
        withParameter("senderOrRecipientId", senderOrRecipientId);
        return this;
    }

    /**
     * The token id.
     *
     * @param tokenId the token id.
     *
     * @return the builder.
     */
    public GetRequests tokenId(String tokenId) {
        withParameter("tokenId", tokenId);
        return this;
    }

    /**
     * The token value.
     *
     * @param value the token value.
     *
     * @return the builder.
     */
    public GetRequests value(String value) {
        withParameter("value", value);
        return this;
    }

    /**
     * A list of states to match.
     *
     * @param stateIn a list of states to match.
     *
     * @return the builder.
     */
    public GetRequests stateMatchesAny(List<TransactionState> stateIn) {
        withParameter("states", stateIn);
        return this;
    }

    /**
     * A list of states to match.
     *
     * @param stateIn a list of states to match.
     *
     * @return the builder.
     */
    public GetRequests stateMatchesAny(TransactionState... stateIn) {
        withParameter("states", stateIn);
        return this;
    }

    /**
     * Whether the transactions can only broadcast.
     *
     * @return the builder.
     */
    public GetRequests canBroadcastOnly() {
        withParameter("onlyBroadcastable", true);
        return this;
    }

}
