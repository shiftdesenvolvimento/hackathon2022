package shift.hackathon.demo.repository.interfaces;

public interface Converter<EntityT, DtoT> {
    DtoT toDto(EntityT entity);
  
    EntityT toEntity(DtoT dto);
  }
  