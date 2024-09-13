/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import jooq.Keys;
import jooq.Public;
import jooq.tables.records.UsersRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>public.users.id</code>.
     */
    public final TableField<UsersRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.users.created_at</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.users.full_name</code>.
     */
    public final TableField<UsersRecord, String> FULL_NAME = createField(DSL.name("full_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.users.updated_at</code>.
     */
    public final TableField<UsersRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(6), this, "");

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    /**
     * Create a <code>public.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.USERS_PKEY;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UK6DOTKOTT2KJSP8VW4D0M25FB7);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    @Override
    public Users as(Table<?> alias) {
        return new Users(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Table<?> name) {
        return new Users(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Users where(Condition condition) {
        return new Users(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Users where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Users where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Users where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Users where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Users where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Users where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Users where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Users whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Users whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
