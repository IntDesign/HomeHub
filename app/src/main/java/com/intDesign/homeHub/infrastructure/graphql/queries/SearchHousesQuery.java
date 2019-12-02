// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.intDesign.homeHub.infrastructure.graphql.queries;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
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
import com.intDesign.homeHub.infrastructure.graphql.types.HouseFilteredRequestType;
import com.intDesign.homeHub.infrastructure.graphql.types.OrderedRequestType;
import com.intDesign.homeHub.infrastructure.graphql.types.PagedRequestType;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class SearchHousesQuery implements Query<SearchHousesQuery.Data, SearchHousesQuery.Data, SearchHousesQuery.Variables> {
  public static final String OPERATION_ID = "1f1cc8f971103a0aacf4e43ca4bc266af97d400f9a34e10308f30f847b5393ed";

  public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify(
          "query searchHouses($pagination: PagedRequestType!, $ordering: OrderedRequestType!, $filter: HouseFilteredRequestType) {\n"
                  + "  house {\n"
                  + "    __typename\n"
                  + "    search(pagination: $pagination, ordering: $ordering, filter: $filter) {\n"
                  + "      __typename\n"
                  + "      items {\n"
                  + "        __typename\n"
                  + "        id\n"
                  + "        houseAddress\n"
                  + "        ownerName\n"
                  + "        ownerEmail\n"
                  + "        ownerPhone\n"
                  + "        userId\n"
                  + "      }\n"
                  + "    }\n"
                  + "  }\n"
                  + "}"
  );

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "searchHouses";
    }
  };

  private final SearchHousesQuery.Variables variables;

  public SearchHousesQuery(@NotNull PagedRequestType pagination,
                           @NotNull OrderedRequestType ordering, @NotNull Input<HouseFilteredRequestType> filter) {
    Utils.checkNotNull(pagination, "pagination == null");
    Utils.checkNotNull(ordering, "ordering == null");
    Utils.checkNotNull(filter, "filter == null");
    variables = new SearchHousesQuery.Variables(pagination, ordering, filter);
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
  public SearchHousesQuery.Data wrapData(SearchHousesQuery.Data data) {
    return data;
  }

  @Override
  public SearchHousesQuery.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<SearchHousesQuery.Data> responseFieldMapper() {
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
    PagedRequestType pagination;

    private @NotNull
    OrderedRequestType ordering;

    private Input<HouseFilteredRequestType> filter = Input.absent();

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

    public Builder filter(@Nullable HouseFilteredRequestType filter) {
      this.filter = Input.fromNullable(filter);
      return this;
    }

    public Builder filterInput(@NotNull Input<HouseFilteredRequestType> filter) {
      this.filter = Utils.checkNotNull(filter, "filter == null");
      return this;
    }

    public SearchHousesQuery build() {
      Utils.checkNotNull(pagination, "pagination == null");
      Utils.checkNotNull(ordering, "ordering == null");
      return new SearchHousesQuery(pagination, ordering, filter);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final @NotNull
    PagedRequestType pagination;

    private final @NotNull
    OrderedRequestType ordering;

    private final Input<HouseFilteredRequestType> filter;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(@NotNull PagedRequestType pagination, @NotNull OrderedRequestType ordering,
              Input<HouseFilteredRequestType> filter) {
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

    public Input<HouseFilteredRequestType> filter() {
      return filter;
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
          writer.writeObject("pagination", pagination.marshaller());
          writer.writeObject("ordering", ordering.marshaller());
          if (filter.defined) {
            writer.writeObject("filter", filter.value != null ? filter.value.marshaller() : null);
          }
        }
      };
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
            ResponseField.forObject("house", "house", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable
    House house;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable House house) {
      this.house = house;
    }

    public @Nullable
    House house() {
      return this.house;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], house != null ? house.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
                + "house=" + house
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
        return ((this.house == null) ? (that.house == null) : this.house.equals(that.house));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (house == null) ? 0 : house.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final House.Mapper houseFieldMapper = new House.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final House house = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<House>() {
          @Override
          public House read(ResponseReader reader) {
            return houseFieldMapper.map(reader);
          }
        });
        return new Data(house);
      }
    }
  }

  public static class House {
    static final ResponseField[] $responseFields = {
            ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
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
                    .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull
    String __typename;

    final @Nullable
    Search search;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public House(@NotNull String __typename, @Nullable Search search) {
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
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeObject($responseFields[1], search != null ? search.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "House{"
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
      if (o instanceof House) {
        House that = (House) o;
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

    public static final class Mapper implements ResponseFieldMapper<House> {
      final Search.Mapper searchFieldMapper = new Search.Mapper();

      @Override
      public House map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final Search search = reader.readObject($responseFields[1], new ResponseReader.ObjectReader<Search>() {
          @Override
          public Search read(ResponseReader reader) {
            return searchFieldMapper.map(reader);
          }
        });
        return new House(__typename, search);
      }
    }
  }

  public static class Search {
    static final ResponseField[] $responseFields = {
            ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forList("items", "items", null, true, Collections.<ResponseField.Condition>emptyList())
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
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeList($responseFields[1], items, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((Item) item).marshaller());
              }
            }
          });
        }
      };
    }

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
        final List<Item> items = reader.readList($responseFields[1], new ResponseReader.ListReader<Item>() {
          @Override
          public Item read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<Item>() {
              @Override
              public Item read(ResponseReader reader) {
                return itemFieldMapper.map(reader);
              }
            });
          }
        });
        return new Search(__typename, items);
      }
    }
  }

  public static class Item {
    static final ResponseField[] $responseFields = {
            ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forString("id", "id", null, true, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forString("houseAddress", "houseAddress", null, true, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forString("ownerName", "ownerName", null, true, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forString("ownerEmail", "ownerEmail", null, true, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forString("ownerPhone", "ownerPhone", null, true, Collections.<ResponseField.Condition>emptyList()),
            ResponseField.forString("userId", "userId", null, true, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull
    String __typename;

    final @Nullable
    String id;

    final @Nullable
    String houseAddress;

    final @Nullable
    String ownerName;

    final @Nullable
    String ownerEmail;

    final @Nullable
    String ownerPhone;

    final @Nullable
    String userId;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Item(@NotNull String __typename, @Nullable String id, @Nullable String houseAddress,
                @Nullable String ownerName, @Nullable String ownerEmail, @Nullable String ownerPhone,
                @Nullable String userId) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = id;
      this.houseAddress = houseAddress;
      this.ownerName = ownerName;
      this.ownerEmail = ownerEmail;
      this.ownerPhone = ownerPhone;
      this.userId = userId;
    }

    public @NotNull
    String __typename() {
      return this.__typename;
    }

    /**
     * House ID
     */
    public @Nullable
    String id() {
      return this.id;
    }

    /**
     * House Address
     */
    public @Nullable
    String houseAddress() {
      return this.houseAddress;
    }

    /**
     * House Owner Name
     */
    public @Nullable
    String ownerName() {
      return this.ownerName;
    }

    /**
     * House Owner Email
     */
    public @Nullable
    String ownerEmail() {
      return this.ownerEmail;
    }

    /**
     * House Owner Phone
     */
    public @Nullable
    String ownerPhone() {
      return this.ownerPhone;
    }

    /**
     * House User Id
     */
    public @Nullable
    String userId() {
      return this.userId;
    }

    @SuppressWarnings("unchecked")
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], id);
          writer.writeString($responseFields[2], houseAddress);
          writer.writeString($responseFields[3], ownerName);
          writer.writeString($responseFields[4], ownerEmail);
          writer.writeString($responseFields[5], ownerPhone);
          writer.writeString($responseFields[6], userId);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Item{"
                + "__typename=" + __typename + ", "
                + "id=" + id + ", "
                + "houseAddress=" + houseAddress + ", "
                + "ownerName=" + ownerName + ", "
                + "ownerEmail=" + ownerEmail + ", "
                + "ownerPhone=" + ownerPhone + ", "
                + "userId=" + userId
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
                && ((this.houseAddress == null) ? (that.houseAddress == null) : this.houseAddress.equals(that.houseAddress))
                && ((this.ownerName == null) ? (that.ownerName == null) : this.ownerName.equals(that.ownerName))
                && ((this.ownerEmail == null) ? (that.ownerEmail == null) : this.ownerEmail.equals(that.ownerEmail))
                && ((this.ownerPhone == null) ? (that.ownerPhone == null) : this.ownerPhone.equals(that.ownerPhone))
                && ((this.userId == null) ? (that.userId == null) : this.userId.equals(that.userId));
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
        h ^= (houseAddress == null) ? 0 : houseAddress.hashCode();
        h *= 1000003;
        h ^= (ownerName == null) ? 0 : ownerName.hashCode();
        h *= 1000003;
        h ^= (ownerEmail == null) ? 0 : ownerEmail.hashCode();
        h *= 1000003;
        h ^= (ownerPhone == null) ? 0 : ownerPhone.hashCode();
        h *= 1000003;
        h ^= (userId == null) ? 0 : userId.hashCode();
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
        final String houseAddress = reader.readString($responseFields[2]);
        final String ownerName = reader.readString($responseFields[3]);
        final String ownerEmail = reader.readString($responseFields[4]);
        final String ownerPhone = reader.readString($responseFields[5]);
        final String userId = reader.readString($responseFields[6]);
        return new Item(__typename, id, houseAddress, ownerName, ownerEmail, ownerPhone, userId);
      }
    }
  }
}
