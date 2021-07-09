package se.junior.developer.sudokubackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.junior.developer.sudokubackend.dtos.GameDto;
import se.junior.developer.sudokubackend.models.Game;

@Mapper
public interface GameMapper {

    GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);

    @Mapping(source = "map", target = "map")
    @Mapping(source = "finishTime", target = "finishTime")
    Game dtoToGame(GameDto gameDto);
}
