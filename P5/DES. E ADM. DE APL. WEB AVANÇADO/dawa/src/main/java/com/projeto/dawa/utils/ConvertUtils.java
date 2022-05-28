package com.projeto.dawa.utils;

@SuppressWarnings("preview")
@Component
public record ConvertUtils<T> (ModelMapperConfig modelMapperConfig) {

	//Generics
	
	public List<T> convertToListResponse(List<T> responses, Class<T> type) {
		return responses
				.stream()
				.map(response -> new ModelMapper().map(response, type))
				.collect(Collectors.toList());
	}
	
	public T convertRequestToEntity(T request, Class<T> type) {
		return modelMapperConfig.modelMapper().map(request, type);
	}
	
	public T convertEntityToResponse(T entity, Class<T> type) {
		return modelMapperConfig.modelMapper().map(entity, type);
	}
	
}
