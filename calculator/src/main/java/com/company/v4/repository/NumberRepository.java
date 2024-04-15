package com.company.v4.repository;

import java.io.IOException;
import java.util.List;

public interface NumberRepository {

  List<Double> readNumbers() throws IOException;

}
