package com.example.android.bookstore.data;

import android.provider.BaseColumns;

public final class BookContract {

    private BookContract() {}

    public static abstract class BookEntry implements BaseColumns {
        public static final String TABLE_NAME = "books";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PRODUCT_NAME = "name";
        public static final String COLUMN_PRODUCT_PRICE = "price";
        public static final String COLUMN_PRODUCT_QUANTITY = "stock";
        public static final String COLUMN_SUPPLIER_NAME = "suppliername";
        public static final String COLUMN_SUPPLIER_PHONE = "suppliernumber";
    }
}
