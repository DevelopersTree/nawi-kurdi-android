package dev.miran.repository.remote.mapper

import dev.miran.entity.Gender
import dev.miran.entity.Name
import dev.miran.repository.remote.dto.NameRemoteDTO


inline fun NameRemoteDTO.toEntity() = Name(
    downVote = downVote,
    description = description,
    gender = toGender(gender),
    id = id,
    name = name,
    upVote = upVote
)

inline fun toGender(gender: String): Gender {
    return when (gender) {
        "F", "f","female" -> Gender.female
        "M","m","male" -> Gender.male
        else -> Gender.other
    }
}

internal fun List<NameRemoteDTO>.toEntity() = map { it.toEntity() }
