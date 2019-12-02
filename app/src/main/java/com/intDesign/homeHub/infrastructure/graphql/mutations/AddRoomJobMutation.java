// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.mutations;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.QueryDocumentMinifier;
import com.intDesign.homeHub.infrastructure.graphql.types.CustomType;
import com.intDesign.homeHub.infrastructure.graphql.types.RoomJobCreateViewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AddRoomJobMutation implements Mutation<AddRoomJobMutation.Data, AddRoomJobMutation.Data, AddRoomJobMutation.Variables> {
    public static final String OPERATION_ID = "579294ba089f7c0b5f90d53a6f9b243212af3da823784787bad9d19930677559";

    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
            "mutation AddRoomJob($job: RoomJobCreateViewModel!) {\n"
                    + "  roomJob:roomJob {\n"
                    + "    __typename\n"
                    + "    addJob(job:$job) {\n"
                    + "      __typename\n"
                    + "      id\n"
                    + "      startDate\n"
                    + "      finishDate\n"
                    + "    }\n"
                    + "  }\n"
                    + "}"
    );

    public static final OperationName OPERATION_NAME = () -> "AddRoomJob";

    private final AddRoomJobMutation.Variables variables;

    public AddRoomJobMutation(@NotNull RoomJobCreateViewModel job) {
        Utils.checkNotNull(job, "job == null");
        variables = new AddRoomJobMutation.Variables(job);
    }

    @NotNull
    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    @Override
    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    @Override
    public AddRoomJobMutation.Data wrapData(AddRoomJobMutation.Data data) {
        return data;
    }

    @Override
    public AddRoomJobMutation.Variables variables() {
        return variables;
    }

    @Override
    public ResponseFieldMapper<AddRoomJobMutation.Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    public static Builder builder() {
        return new Builder();
    }

    @NotNull
    @Override
    public OperationName name() {
        return OPERATION_NAME;
    }

    public static final class Builder {
        private @NotNull
        RoomJobCreateViewModel job;

        Builder() {
        }

        public Builder job(@NotNull RoomJobCreateViewModel job) {
            this.job = job;
            return this;
        }

        public AddRoomJobMutation build() {
            Utils.checkNotNull(job, "job == null");
            return new AddRoomJobMutation(job);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final @NotNull
        RoomJobCreateViewModel job;

        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@NotNull RoomJobCreateViewModel job) {
            this.job = job;
            this.valueMap.put("job", job);
        }

        public @NotNull
        RoomJobCreateViewModel job() {
            return job;
        }

        @NotNull
        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return writer -> writer.writeObject("job", job.marshaller());
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {
                ResponseField.forObject("roomJob", "roomJob", null, true, Collections.emptyList())
        };

        final @Nullable
        RoomJob roomJob;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Data(@Nullable RoomJob roomJob) {
            this.roomJob = roomJob;
        }

        public @Nullable
        RoomJob roomJob() {
            return this.roomJob;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> writer.writeObject($responseFields[0], roomJob != null ? roomJob.marshaller() : null);
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Data{"
                        + "roomJob=" + roomJob
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
                return ((this.roomJob == null) ? (that.roomJob == null) : this.roomJob.equals(that.roomJob));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= (roomJob == null) ? 0 : roomJob.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final RoomJob.Mapper roomJobFieldMapper = new RoomJob.Mapper();

            @Override
            public Data map(ResponseReader reader) {
                final RoomJob roomJob = reader.readObject($responseFields[0], roomJobFieldMapper::map);
                return new Data(roomJob);
            }
        }
    }

    public static class RoomJob {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forObject("addJob", "addJob", new UnmodifiableMapBuilder<String, Object>(1)
                        .put("job", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "job")
                                .build())
                        .build(), true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        AddJob addJob;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public RoomJob(@NotNull String __typename, @Nullable AddJob addJob) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.addJob = addJob;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        public @Nullable
        AddJob addJob() {
            return this.addJob;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeObject($responseFields[1], addJob != null ? addJob.marshaller() : null);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "RoomJob{"
                        + "__typename=" + __typename + ", "
                        + "addJob=" + addJob
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof RoomJob) {
                RoomJob that = (RoomJob) o;
                return this.__typename.equals(that.__typename)
                        && ((this.addJob == null) ? (that.addJob == null) : this.addJob.equals(that.addJob));
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
                h ^= (addJob == null) ? 0 : addJob.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RoomJob> {
            final AddJob.Mapper addJobFieldMapper = new AddJob.Mapper();

            @Override
            public RoomJob map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final AddJob addJob = reader.readObject($responseFields[1], addJobFieldMapper::map);
                return new RoomJob(__typename, addJob);
            }
        }
    }

    public static class AddJob {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forString("id", "id", null, true, Collections.emptyList()),
                ResponseField.forCustomType("startDate", "startDate", null, true, CustomType.DATETIME, Collections.emptyList()),
                ResponseField.forCustomType("finishDate", "finishDate", null, true, CustomType.DATETIME, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        String id;

        final @Nullable
        Object startDate;

        final @Nullable
        Object finishDate;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public AddJob(@NotNull String __typename, @Nullable String id, @Nullable Object startDate,
                      @Nullable Object finishDate) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.id = id;
            this.startDate = startDate;
            this.finishDate = finishDate;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        /**
         * RoomJob ID
         */
        public @Nullable
        String id() {
            return this.id;
        }

        /**
         * RoomJob Start Date
         */
        public @Nullable
        Object startDate() {
            return this.startDate;
        }

        /**
         * RoomJob Finish Date
         */
        public @Nullable
        Object finishDate() {
            return this.finishDate;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeString($responseFields[1], id);
                writer.writeCustom((ResponseField.CustomTypeField) $responseFields[2], startDate);
                writer.writeCustom((ResponseField.CustomTypeField) $responseFields[3], finishDate);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "AddJob{"
                        + "__typename=" + __typename + ", "
                        + "id=" + id + ", "
                        + "startDate=" + startDate + ", "
                        + "finishDate=" + finishDate
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof AddJob) {
                AddJob that = (AddJob) o;
                return this.__typename.equals(that.__typename)
                        && ((this.id == null) ? (that.id == null) : this.id.equals(that.id))
                        && ((this.startDate == null) ? (that.startDate == null) : this.startDate.equals(that.startDate))
                        && ((this.finishDate == null) ? (that.finishDate == null) : this.finishDate.equals(that.finishDate));
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
                h *= 1000003;
                h ^= (startDate == null) ? 0 : startDate.hashCode();
                h *= 1000003;
                h ^= (finishDate == null) ? 0 : finishDate.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<AddJob> {
            @Override
            public AddJob map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final String id = reader.readString($responseFields[1]);
                final Object startDate = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[2]);
                final Object finishDate = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[3]);
                return new AddJob(__typename, id, startDate, finishDate);
            }
        }
    }
}