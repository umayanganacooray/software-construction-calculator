package com.company.v5.repository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface NumberRepository {

  List<Double> readNumbers() throws NumberRepositoryException;

}
