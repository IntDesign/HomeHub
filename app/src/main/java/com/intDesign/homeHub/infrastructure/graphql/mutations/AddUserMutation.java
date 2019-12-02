// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.mutations;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.QueryDocumentMinifier;
import com.intDesign.homeHub.infrastructure.graphql.types.UserCreateViewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AddUserMutation implements Mutation<AddUserMutation.Data, AddUserMutation.Data, AddUserMutation.Variables> {
    public static final String OPERATION_ID = "06ed29ef8a85158e725b96f8b0a1c1a6b10faeb14d45d74a0ae0f429dfb1bcbc";

    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
            "mutation addUser($user: UserCreateViewModel!) {\n"
                    + "  users {\n"
                    + "    __typename\n"
                    + "    addUser(user: $user) {\n"
                    + "      __typename\n"
                    + "      id\n"
                    + "    }\n"
                    + "  }\n"
                    + "}"
    );

    public static final OperationName OPERATION_NAME = new OperationName() {
        @Override
        public String name() {
            return "addUser";
        }
    };

    private final AddUserMutation.Variables variables;

    public AddUserMutation(@NotNull UserCreateViewModel user) {
        Utils.checkNotNull(user, "user == null");
        variables = new AddUserMutation.Variables(user);
    }

    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    @Override
    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    @Override
    public AddUserMutation.Data wrapData(AddUserMutation.Data data) {
        return data;
    }

    @Override
    public AddUserMutation.Variables variables() {
        return variables;
    }

    @Override
    public ResponseFieldMapper<AddUserMutation.Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public OperationName name() {
        return OPERATION_NAME;
    }

    public static final class Builder {
        private @NotNull
        UserCreateViewModel user;

        Builder() {
        }

        public Builder user(@NotNull UserCreateViewModel user) {
            this.user = user;
            return this;
        }

        public AddUserMutation build() {
            Utils.checkNotNull(user, "user == null");
            return new AddUserMutation(user);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final @NotNull
        UserCreateViewModel user;

        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@NotNull UserCreateViewModel user) {
            this.user = user;
            this.valueMap.put("user", user);
        }

        public @NotNull
        UserCreateViewModel user() {
            return user;
        }

        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() {
                @Override
                public void marshal(InputFieldWriter writer) throws IOException {
                    writer.writeObject("user", user.marshaller());
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {
                ResponseField.forObject("users", "users", null, true, Collections.<ResponseField.Condition>emptyList())
        };

        final @Nullable
        Users users;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Data(@Nullable Users users) {
            this.users = users;
        }

        public @Nullable
        Users users() {
            return this.users;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                @Override
                public void marshal(ResponseWriter writer) {
                    writer.writeObject($responseFields[0], users != null ? users.marshaller() : null);
                }
            };
        }

        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Data{"
                        + "users=" + users
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Data) {
                Data that = (Data) o;
                return ((this.users == null) ? (that.users == null) : this.users.equals(that.users));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= (users == null) ? 0 : users.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Users.Mapper usersFieldMapper = new Users.Mapper();

            @Override
            public Data map(ResponseReader reader) {
                final Users users = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<Users>() {
                    @Override
                    public Users read(ResponseReader reader) {
                        return usersFieldMapper.map(reader);
                    }
                });
                return new Data(users);
            }
        }
    }

    public static class Users {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
                ResponseField.forObject("addUser", "addUser", new UnmodifiableMapBuilder<String, Object>(1)
                        .put("user", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "user")
                                .build())
                        .build(), true, Collections.<ResponseField.Condition>emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        AddUser addUser;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Users(@NotNull String __typename, @Nullable AddUser addUser) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.addUser = addUser;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        public @Nullable
        AddUser addUser() {
            return this.addUser;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                @Override
                public void marshal(ResponseWriter writer) {
                    writer.writeString($responseFields[0], __typename);
                    writer.writeObject($responseFields[1], addUser != null ? addUser.marshaller() : null);
                }
            };
        }

        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Users{"
                        + "__typename=" + __typename + ", "
                        + "addUser=" + addUser
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Users) {
                Users that = (Users) o;
                return this.__typename.equals(that.__typename)
                        && ((this.addUser == null) ? (that.addUser == null) : this.addUser.equals(that.addUser));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= __typename.hashCode();
                h *= 1000003;
                h ^= (addUser == null) ? 0 : addUser.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Users> {
            final AddUser.Mapper addUserFieldMapper = new AddUser.Mapper();

            @Override
            public Users map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final AddUser addUser = reader.readObject($responseFields[1], new ResponseReader.ObjectReader<AddUser>() {
                    @Override
                    public AddUser read(ResponseReader reader) {
                        return addUserFieldMapper.map(reader);
                    }
                });
                return new Users(__typename, addUser);
            }
        }
    }

    public static class AddUser {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
                ResponseField.forString("id", "id", null, true, Collections.<ResponseField.Condition>emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        String id;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public AddUser(@NotNull String __typename, @Nullable String id) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.id = id;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        /**
         * User ID
         */
        public @Nullable
        String id() {
            return this.id;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                @Override
                public void marshal(ResponseWriter writer) {
                    writer.writeString($responseFields[0], __typename);
                    writer.writeString($responseFields[1], id);
                }
            };
        }

        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "AddUser{"
                        + "__typename=" + __typename + ", "
                        + "id=" + id
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof AddUser) {
                AddUser that = (AddUser) o;
                return this.__typename.equals(that.__typename)
                        && ((this.id == null) ? (that.id == null) : this.id.equals(that.id));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= __typename.hashCode();
                h *= 1000003;
                h ^= (id == null) ? 0 : id.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<AddUser> {
            @Override
            public AddUser map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final String id = reader.readString($responseFields[1]);
                return new AddUser(__typename, id);
            }
        }
    }
}
