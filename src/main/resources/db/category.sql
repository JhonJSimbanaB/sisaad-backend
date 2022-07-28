CREATE TABLE IF NOT EXISTS public.categories
(
    category_id integer NOT NULL DEFAULT nextval('categories_category_id_seq'::regclass),
    name character varying COLLATE pg_catalog."default",
    descripcion character varying COLLATE pg_catalog."default",
    created timestamp with time zone,
    updated timestamp with time zone,
    enabled boolean,
    archived boolean,
    CONSTRAINT categories_pkey PRIMARY KEY (category_id)
)