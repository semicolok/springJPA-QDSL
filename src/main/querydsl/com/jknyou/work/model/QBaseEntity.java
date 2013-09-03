package com.jknyou.work.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBaseEntity is a Querydsl query type for BaseEntity
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QBaseEntity extends EntityPathBase<BaseEntity<? extends java.io.Serializable>> {

    private static final long serialVersionUID = -946164377;

    public static final QBaseEntity baseEntity = new QBaseEntity("baseEntity");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    //inherited
    public final SimplePath<java.io.Serializable> id = _super.id;

    @SuppressWarnings("all")
    public QBaseEntity(String variable) {
        super((Class)BaseEntity.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QBaseEntity(Path<? extends BaseEntity> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    @SuppressWarnings("all")
    public QBaseEntity(PathMetadata<?> metadata) {
        super((Class)BaseEntity.class, metadata);
    }

}

