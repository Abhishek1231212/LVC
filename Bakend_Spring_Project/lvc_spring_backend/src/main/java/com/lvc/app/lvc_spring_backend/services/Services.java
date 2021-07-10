package com.lvc.app.lvc_spring_backend.services;

import java.util.List;
import java.util.Optional;

public interface Services<T> {
	T add(T t);

	List<T> fetchAll();

	Optional<T> get(Long id);

	void remove(Long id);
}
