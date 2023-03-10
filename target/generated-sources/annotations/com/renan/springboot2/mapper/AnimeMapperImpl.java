package com.renan.springboot2.mapper;

import com.renan.springboot2.domain.Anime;
import com.renan.springboot2.domain.Anime.AnimeBuilder;
import com.renan.springboot2.requests.AnimePostRequestBody;
import com.renan.springboot2.requests.AnimePutRequestBody;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-10T18:05:26-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class AnimeMapperImpl extends AnimeMapper {

    @Override
    public Anime toAnime(AnimePostRequestBody animePostRequestBody) {
        if ( animePostRequestBody == null ) {
            return null;
        }

        AnimeBuilder anime = Anime.builder();

        anime.name( animePostRequestBody.getName() );

        return anime.build();
    }

    @Override
    public Anime toAnime(AnimePutRequestBody animePutRequestBody) {
        if ( animePutRequestBody == null ) {
            return null;
        }

        AnimeBuilder anime = Anime.builder();

        anime.id( animePutRequestBody.getId() );
        anime.name( animePutRequestBody.getName() );

        return anime.build();
    }
}
