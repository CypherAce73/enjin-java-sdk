package com.enjin.enjincoin.sdk.model.service.users;

import com.enjin.enjincoin.sdk.graphql.GraphQLRequest;
import com.enjin.enjincoin.sdk.model.service.roles.Role;

import java.util.List;

/**
 * A builder for creating a new user on the Trusted platform.
 *
 * @author Evan Lindsay
 * @see com.enjin.enjincoin.sdk.service.users.UsersService
 */
public class UpdateUser extends GraphQLRequest<UpdateUser> {

    public UpdateUser id(String id) {
        withParameter("id", id);
        return this;
    }

    /**
     * The name of the user.
     *
     * @param name the name.
     *
     * @return the builder.
     */
    public UpdateUser name(String name) {
        withParameter("name", name);
        return this;
    }

    /**
     * The email of the user.
     *
     * @param email the email.
     *
     * @return the builder.
     */
    public UpdateUser email(String email) {
        withParameter("email", email);
        return this;
    }

    /**
     * The password of the user.
     *
     * @param password the password.
     *
     * @return the builder.
     */
    public UpdateUser password(String password) {
        withParameter("password", password);
        return this;
    }

    public UpdateUser identityId(int identityId) {
        withParameter("identity_id", identityId);
        return this;
    }

    public UpdateUser roles(Role... roles) {
        withParameter("roles", roles);
        return this;
    }

    public UpdateUser roles(List<Role> roles) {
        withParameter("roles", roles);
        return this;
    }

    public UpdateUser resetPassword() {
        withParameter("reset_password", true);
        return this;
    }

    public UpdateUser resetPasswordToken(String token) {
        withParameter("reset_password_token", token);
        return this;
    }

}
