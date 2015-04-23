/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.data.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sample.data.jpa.domain.City;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "citys", path = "cities")
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

	public Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(
			@Param("name") String name, @Param("country") String country,
			Pageable pageable);

	public List<City> findByNameAndCountryAllIgnoringCase(@Param("name") String name,
			@Param("country") String country);

	public List<City> findByMap(String map);

	public List<City> findByNameAndMap(@Param("name") String name, @Param("map") String map);

	public List<City> findByNameLike(@Param("name") String name);

}
