package com.codeSathi.repository;

import com.codeSathi.entities.Slot;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link SlotRepository}.
 */
@Generated
public class SlotRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public SlotRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link SlotRepository#findByParkingLotId(java.lang.Long)}.
   */
  public List<Slot> findByParkingLotId(Long lotId) {
    String queryString = "SELECT s FROM Slot s WHERE s.parkingLot.id = :lotId";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("lotId", lotId);

    return (List<Slot>) query.getResultList();
  }
}
