def solution(players, callings):
    player_dict = {player: rank for rank, player in enumerate(players)}
    rank_dict = {rank: player for rank, player in enumerate(players)}

    for call in callings:
        rank = player_dict[call]
        previous_rank = rank - 1
        
        player_dict[rank_dict[previous_rank]], player_dict[rank_dict[rank]] = player_dict[rank_dict[rank]], player_dict[rank_dict[previous_rank]]
        rank_dict[previous_rank], rank_dict[rank] = rank_dict[rank], rank_dict[previous_rank]
    
    return list(rank_dict.values())
