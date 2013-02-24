/*
 *      Copyright (c) 2004-2013 Stuart Boston
 *
 *      This file is part of TheMovieDB API.
 *
 *      TheMovieDB API is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      any later version.
 *
 *      TheMovieDB API is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with TheMovieDB API.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.omertron.themoviedbapi.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omertron.themoviedbapi.model.MovieList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Stuart
 */
public class WrapperMovieList extends WrapperBase {
    /*
     * Properties
     */

    @JsonProperty("results")
    private List<MovieList> movieList;

    public WrapperMovieList() {
        super(LoggerFactory.getLogger(WrapperMovieList.class));
    }

    public List<MovieList> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<MovieList> movieList) {
        this.movieList = movieList;
    }
}
