package com.company.v5.repository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SqlNumberRepository implements NumberRepository {

  @Override
  public List<Double> readNumbers() throws NumberRepositoryException {
    //todo: read numbers from an SQL database

    /*try {
      //connect to the mysql database
      // read the numbers
    } catch (SQLException e) {
      throw new NumberRepositoryException("Error occurred while reading numbers from the SQL database.", e);
    }*/

    return null;
  }
}
