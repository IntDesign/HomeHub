// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.queries;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.internal.QueryDocumentMinifier;
import com.intDesign.homeHub.infrastructure.graphql.types.OrderedRequestType;
import com.intDesign.homeHub.infrastructure.graphql.types.PagedRequestType;
import com.intDesign.homeHub.infrastructure.graphql.types.RoomObjectType;
import com.intDesign.homeHub.infrastructure.graphql.types.RoomWallObjectFilteredRequestType;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class SearchWallObjectsQuery implements Query<SearchWallObjectsQuery.Data, SearchWallObjectsQuery.Data, SearchWallObjectsQuery.Variables> {
    public static final String OPERATION_ID = "ec41318d3d6ccc553bfa3b603d77972a7d738ece528c8d8d2501ddfd79d07eea";

    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
            "query searchWallObjects($pagination: PagedRequestType!, $ordering: OrderedRequestType!, $filter: RoomWallObjectFilteredRequestType) {\n"
                    + "  wallObject {\n"
                    + "    __typename\n"
                    + "    search(pagination: $pagination, ordering: $ordering, filter: $filter) {\n"
                    + "      __typename\n"
                    + "      items {\n"
                    + "        __typename\n"
                    + "        id\n"
                    + "        area\n"
                    + "        lenght\n"
                    + "        number\n"
                    + "        roomId\n"
                    + "        wallObjectType\n"
                    + "        width\n"
                    + "      }\n"
                    + "    }\n"
                    + "  }\n"
                    + "}"
    );

    public static final OperationName OPERATION_NAME = () -> "searchWallObjects";

    private final SearchWallObjectsQuery.Variables variables;

    public SearchWallObjectsQuery(@NotNull PagedRequestType pagination,
                                  @NotNull OrderedRequestType ordering,
                                  @NotNull Input<RoomWallObjectFilteredRequestType> filter) {
        Utils.checkNotNull(pagination, "pagination == null");
        Utils.checkNotNull(ordering, "ordering == null");
        Utils.checkNotNull(filter, "filter == null");
        variables = new SearchWallObjectsQuery.Variables(pagination, ordering, filter);
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
    public SearchWallObjectsQuery.Data wrapData(SearchWallObjectsQuery.Data data) {
        return data;
    }

    @Override
    public SearchWallObjectsQuery.Variables variables() {
        return variables;
    }

    @Override
    public ResponseFieldMapper<SearchWallObjectsQuery.Data> responseFieldMapper() {
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
        PagedRequestType pagination;

        private @NotNull
        OrderedRequestType ordering;

        private Input<RoomWallObjectFilteredRequestType> filter = Input.absent();

        Builder() {
        }

        public Builder pagination(@NotNull PagedRequestType pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder ordering(@NotNull OrderedRequestType ordering) {
            this.ordering = ordering;
            return this;
        }

        public Builder filter(@Nullable RoomWallObjectFilteredRequestType filter) {
            this.filter = Input.fromNullable(filter);
            return this;
        }

        public Builder filterInput(@NotNull Input<RoomWallObjectFilteredRequestType> filter) {
            this.filter = Utils.checkNotNull(filter, "filter == null");
            return this;
        }

        public SearchWallObjectsQuery build() {
            Utils.checkNotNull(pagination, "pagination == null");
            Utils.checkNotNull(ordering, "ordering == null");
            return new SearchWallObjectsQuery(pagination, ordering, filter);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final @NotNull
        PagedRequestType pagination;

        private final @NotNull
        OrderedRequestType ordering;

        private final Input<RoomWallObjectFilteredRequestType> filter;

        private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

        Variables(@NotNull PagedRequestType pagination, @NotNull OrderedRequestType ordering,
                  Input<RoomWallObjectFilteredRequestType> filter) {
            this.pagination = pagination;
            this.ordering = ordering;
            this.filter = filter;
            this.valueMap.put("pagination", pagination);
            this.valueMap.put("ordering", ordering);
            if (filter.defined) {
                this.valueMap.put("filter", filter.value);
            }
        }

        public @NotNull
        PagedRequestType pagination() {
            return pagination;
        }

        public @NotNull
        OrderedRequestType ordering() {
            return ordering;
        }

        public Input<RoomWallObjectFilteredRequestType> filter() {
            return filter;
        }

        @NotNull
        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return writer -> {
                writer.writeObject("pagination", pagination.marshaller());
                writer.writeObject("ordering", ordering.marshaller());
                if (filter.defined) {
                    writer.writeObject("filter", filter.value != null ? filter.value.marshaller() : null);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {
                ResponseField.forObject("wallObject", "wallObject", null, true, Collections.emptyList())
        };

        final @Nullable
        WallObject wallObject;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Data(@Nullable WallObject wallObject) {
            this.wallObject = wallObject;
        }

        public @Nullable
        WallObject wallObject() {
            return this.wallObject;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> writer.writeObject($responseFields[0], wallObject != null ? wallObject.marshaller() : null);
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Data{"
                        + "wallObject=" + wallObject
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
                return ((this.wallObject == null) ? (that.wallObject == null) : this.wallObject.equals(that.wallObject));
            }
            return false;
        }

        @Override
        public int hashCode() {
            if (!$hashCodeMemoized) {
                int h = 1;
                h *= 1000003;
                h ^= (wallObject == null) ? 0 : wallObject.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final WallObject.Mapper wallObjectFieldMapper = new WallObject.Mapper();

            @Override
            public Data map(ResponseReader reader) {
                final WallObject wallObject = reader.readObject($responseFields[0], wallObjectFieldMapper::map);
                return new Data(wallObject);
            }
        }
    }

    public static class WallObject {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forObject("search", "search", new UnmodifiableMapBuilder<String, Object>(3)
                        .put("pagination", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "pagination")
                                .build())
                        .put("ordering", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "ordering")
                                .build())
                        .put("filter", new UnmodifiableMapBuilder<String, Object>(2)
                                .put("kind", "Variable")
                                .put("variableName", "filter")
                                .build())
                        .build(), true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        Search search;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public WallObject(@NotNull String __typename, @Nullable Search search) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.search = search;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        public @Nullable
        Search search() {
            return this.search;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeObject($responseFields[1], search != null ? search.marshaller() : null);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "WallObject{"
                        + "__typename=" + __typename + ", "
                        + "search=" + search
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof WallObject) {
                WallObject that = (WallObject) o;
                return this.__typename.equals(that.__typename)
                        && ((this.search == null) ? (that.search == null) : this.search.equals(that.search));
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
                h ^= (search == null) ? 0 : search.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<WallObject> {
            final Search.Mapper searchFieldMapper = new Search.Mapper();

            @Override
            public WallObject map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final Search search = reader.readObject($responseFields[1], searchFieldMapper::map);
                return new WallObject(__typename, search);
            }
        }
    }

    public static class Search {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forList("items", "items", null, true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        List<Item> items;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Search(@NotNull String __typename, @Nullable List<Item> items) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.items = items;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        /**
         * A list of all of the objects returned in the connection.
         */
        public @Nullable
        List<Item> items() {
            return this.items;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeList($responseFields[1], items, (ResponseWriter.ListWriter) (items, listItemWriter) -> {
                    for (Object item : items) {
                        listItemWriter.writeObject(((Item) item).marshaller());
                    }
                });
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Search{"
                        + "__typename=" + __typename + ", "
                        + "items=" + items
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Search) {
                Search that = (Search) o;
                return this.__typename.equals(that.__typename)
                        && ((this.items == null) ? (that.items == null) : this.items.equals(that.items));
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
                h ^= (items == null) ? 0 : items.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Search> {
            final Item.Mapper itemFieldMapper = new Item.Mapper();

            @Override
            public Search map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final List<Item> items = reader.readList($responseFields[1], listItemReader -> listItemReader.readObject(itemFieldMapper::map));
                return new Search(__typename, items);
            }
        }
    }

    public static class Item {
        static final ResponseField[] $responseFields = {
                ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()),
                ResponseField.forString("id", "id", null, true, Collections.emptyList()),
                ResponseField.forDouble("area", "area", null, true, Collections.emptyList()),
                ResponseField.forDouble("lenght", "lenght", null, true, Collections.emptyList()),
                ResponseField.forDouble("number", "number", null, true, Collections.emptyList()),
                ResponseField.forString("roomId", "roomId", null, true, Collections.emptyList()),
                ResponseField.forString("wallObjectType", "wallObjectType", null, true, Collections.emptyList()),
                ResponseField.forDouble("width", "width", null, true, Collections.emptyList())
        };

        final @NotNull
        String __typename;

        final @Nullable
        String id;

        final @Nullable
        Double area;

        final @Nullable
        Double lenght;

        final @Nullable
        Double number;

        final @Nullable
        String roomId;

        final @Nullable
        RoomObjectType wallObjectType;

        final @Nullable
        Double width;

        private transient volatile String $toString;

        private transient volatile int $hashCode;

        private transient volatile boolean $hashCodeMemoized;

        public Item(@NotNull String __typename, @Nullable String id, @Nullable Double area,
                    @Nullable Double lenght, @Nullable Double number, @Nullable String roomId,
                    @Nullable RoomObjectType wallObjectType, @Nullable Double width) {
            this.__typename = Utils.checkNotNull(__typename, "__typename == null");
            this.id = id;
            this.area = area;
            this.lenght = lenght;
            this.number = number;
            this.roomId = roomId;
            this.wallObjectType = wallObjectType;
            this.width = width;
        }

        public @NotNull
        String __typename() {
            return this.__typename;
        }

        /**
         * Wall Object ID
         */
        public @Nullable
        String id() {
            return this.id;
        }

        /**
         * Wall Object Area
         */
        public @Nullable
        Double area() {
            return this.area;
        }

        /**
         * Wall Object Lenght
         */
        public @Nullable
        Double lenght() {
            return this.lenght;
        }

        /**
         * Wall Object Number in Room
         */
        public @Nullable
        Double number() {
            return this.number;
        }

        /**
         * The Room Id that contains this object
         */
        public @Nullable
        String roomId() {
            return this.roomId;
        }

        public @Nullable
        RoomObjectType wallObjectType() {
            return this.wallObjectType;
        }

        /**
         * Wall Object Width
         */
        public @Nullable
        Double width() {
            return this.width;
        }

        @SuppressWarnings("unchecked")
        public ResponseFieldMarshaller marshaller() {
            return writer -> {
                writer.writeString($responseFields[0], __typename);
                writer.writeString($responseFields[1], id);
                writer.writeDouble($responseFields[2], area);
                writer.writeDouble($responseFields[3], lenght);
                writer.writeDouble($responseFields[4], number);
                writer.writeString($responseFields[5], roomId);
                writer.writeString($responseFields[6], wallObjectType != null ? wallObjectType.rawValue() : null);
                writer.writeDouble($responseFields[7], width);
            };
        }

        @NotNull
        @Override
        public String toString() {
            if ($toString == null) {
                $toString = "Item{"
                        + "__typename=" + __typename + ", "
                        + "id=" + id + ", "
                        + "area=" + area + ", "
                        + "lenght=" + lenght + ", "
                        + "number=" + number + ", "
                        + "roomId=" + roomId + ", "
                        + "wallObjectType=" + wallObjectType + ", "
                        + "width=" + width
                        + "}";
            }
            return $toString;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Item) {
                Item that = (Item) o;
                return this.__typename.equals(that.__typename)
                        && ((this.id == null) ? (that.id == null) : this.id.equals(that.id))
                        && ((this.area == null) ? (that.area == null) : this.area.equals(that.area))
                        && ((this.lenght == null) ? (that.lenght == null) : this.lenght.equals(that.lenght))
                        && ((this.number == null) ? (that.number == null) : this.number.equals(that.number))
                        && ((this.roomId == null) ? (that.roomId == null) : this.roomId.equals(that.roomId))
                        && ((this.wallObjectType == null) ? (that.wallObjectType == null) : this.wallObjectType.equals(that.wallObjectType))
                        && ((this.width == null) ? (that.width == null) : this.width.equals(that.width));
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
                h ^= (area == null) ? 0 : area.hashCode();
                h *= 1000003;
                h ^= (lenght == null) ? 0 : lenght.hashCode();
                h *= 1000003;
                h ^= (number == null) ? 0 : number.hashCode();
                h *= 1000003;
                h ^= (roomId == null) ? 0 : roomId.hashCode();
                h *= 1000003;
                h ^= (wallObjectType == null) ? 0 : wallObjectType.hashCode();
                h *= 1000003;
                h ^= (width == null) ? 0 : width.hashCode();
                $hashCode = h;
                $hashCodeMemoized = true;
            }
            return $hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Item> {
            @Override
            public Item map(ResponseReader reader) {
                final String __typename = reader.readString($responseFields[0]);
                final String id = reader.readString($responseFields[1]);
                final Double area = reader.readDouble($responseFields[2]);
                final Double lenght = reader.readDouble($responseFields[3]);
                final Double number = reader.readDouble($responseFields[4]);
                final String roomId = reader.readString($responseFields[5]);
                final String wallObjectTypeStr = reader.readString($responseFields[6]);
                final RoomObjectType wallObjectType;
                if (wallObjectTypeStr != null) {
                    wallObjectType = RoomObjectType.safeValueOf(wallObjectTypeStr);
                } else {
                    wallObjectType = null;
                }
                final Double width = reader.readDouble($responseFields[7]);
                return new Item(__typename, id, area, lenght, number, roomId, wallObjectType, width);
            }
        }
    }
}
