/**
 * This class is generated by jOOQ
 */
package com.songspk.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Songs extends org.jooq.impl.TableImpl<com.songspk.tables.records.SongsRecord> {

	private static final long serialVersionUID = 1507549501;

	/**
	 * The singleton instance of <code>public.songs</code>
	 */
	public static final com.songspk.tables.Songs SONGS = new com.songspk.tables.Songs();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.songspk.tables.records.SongsRecord> getRecordType() {
		return com.songspk.tables.records.SongsRecord.class;
	}

	/**
	 * The column <code>public.songs.name</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.songs.link</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.String> LINK = createField("link", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.songs.director</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.String> DIRECTOR = createField("director", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.songs.movie</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.String> MOVIE = createField("movie", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.songs.album_id</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.Long> ALBUM_ID = createField("album_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.songs.singers</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.String> SINGERS = createField("singers", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

	/**
	 * The column <code>public.songs.id</code>.
	 */
	public final org.jooq.TableField<com.songspk.tables.records.SongsRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.songs</code> table reference
	 */
	public Songs() {
		this("songs", null);
	}

	/**
	 * Create an aliased <code>public.songs</code> table reference
	 */
	public Songs(java.lang.String alias) {
		this(alias, com.songspk.tables.Songs.SONGS);
	}

	private Songs(java.lang.String alias, org.jooq.Table<com.songspk.tables.records.SongsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Songs(java.lang.String alias, org.jooq.Table<com.songspk.tables.records.SongsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.songspk.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.songspk.tables.records.SongsRecord, java.lang.Long> getIdentity() {
		return com.songspk.Keys.IDENTITY_SONGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.songspk.tables.records.SongsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.songspk.tables.records.SongsRecord, ?>>asList(com.songspk.Keys.SONGS__SONGS_ALBUM_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.songspk.tables.Songs as(java.lang.String alias) {
		return new com.songspk.tables.Songs(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.songspk.tables.Songs rename(java.lang.String name) {
		return new com.songspk.tables.Songs(name, null);
	}
}