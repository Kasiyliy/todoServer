package kz.kasya.cheena.AttendMe.shared.utils.mappers;

import kz.kasya.cheena.AttendMe.models.audits.AuditModel;

import java.util.List;

public abstract class AbstractModelMapper<E extends AuditModel,D> {

    public abstract D toDto (E e);
    public abstract E toEntity(D d);
    public abstract List<D> toDtoList(List<E> eList);
    public abstract List<E> toEntityList(List<D> dList);

}
