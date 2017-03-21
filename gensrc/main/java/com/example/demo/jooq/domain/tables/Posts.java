/*
 * This file is generated by jOOQ.
*/
package com.example.demo.jooq.domain.tables;


import com.example.demo.jooq.domain.Keys;
import com.example.demo.jooq.domain.Springbootjooq;
import com.example.demo.jooq.domain.tables.records.PostsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Posts extends TableImpl<PostsRecord> {

    private static final long serialVersionUID = -29330433;

    /**
     * The reference instance of <code>springbootjooq.posts</code>
     */
    public static final Posts POSTS = new Posts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PostsRecord> getRecordType() {
        return PostsRecord.class;
    }

    /**
     * The column <code>springbootjooq.posts.ID</code>.
     */
    public final TableField<PostsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>springbootjooq.posts.TITLE</code>.
     */
    public final TableField<PostsRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>springbootjooq.posts.CONTENT</code>.
     */
    public final TableField<PostsRecord, String> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>springbootjooq.posts.CREATED_ON</code>.
     */
    public final TableField<PostsRecord, Timestamp> CREATED_ON = createField("CREATED_ON", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>springbootjooq.posts</code> table reference
     */
    public Posts() {
        this("posts", null);
    }

    /**
     * Create an aliased <code>springbootjooq.posts</code> table reference
     */
    public Posts(String alias) {
        this(alias, POSTS);
    }

    private Posts(String alias, Table<PostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Posts(String alias, Table<PostsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Springbootjooq.SPRINGBOOTJOOQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PostsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_POSTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PostsRecord> getPrimaryKey() {
        return Keys.KEY_POSTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PostsRecord>> getKeys() {
        return Arrays.<UniqueKey<PostsRecord>>asList(Keys.KEY_POSTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Posts as(String alias) {
        return new Posts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Posts rename(String name) {
        return new Posts(name, null);
    }
}
