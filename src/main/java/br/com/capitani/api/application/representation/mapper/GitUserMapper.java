package br.com.capitani.api.application.representation.mapper;

import br.com.capitani.api.domain.git.resultado.GitUserModel;
import br.com.capitani.api.domain.git.resultado.GitUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper(componentModel = "spring")
public abstract class GitUserMapper {
    public static final GitUserMapper INSTANCE = Mappers.getMapper(GitUserMapper.class);

    public static GitUserModel toModel(GitUserResponse gitUserResponse){
        return GitUserModel.builder()
                .idGit(gitUserResponse.getId())
                .login(gitUserResponse.getLogin())
                .name(gitUserResponse.getName())
                .avatarUrl(gitUserResponse.getGetAvatar_url())
                .build();
    }
}
