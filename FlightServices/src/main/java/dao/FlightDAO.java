package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dto.Flight;
@Repository
public interface FlightDAO extends JpaRepository<Flight,String>
{

}
