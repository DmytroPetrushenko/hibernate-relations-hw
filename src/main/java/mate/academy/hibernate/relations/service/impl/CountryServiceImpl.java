package mate.academy.hibernate.relations.service.impl;

import mate.academy.hibernate.relations.dao.CountryDao;
import mate.academy.hibernate.relations.dao.impl.CountryDaoImpl;
import mate.academy.hibernate.relations.model.Country;
import mate.academy.hibernate.relations.service.CountryService;
import org.hibernate.SessionFactory;

public class CountryServiceImpl extends AbstractService implements CountryService {
    public CountryServiceImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    CountryDao countryDao = new CountryDaoImpl(factory);

    @Override
    public Country add(Country country) {
        countryDao.add(country);
        return country;
    }

    @Override
    public Country get(Long id) {
        return null;
    }
}
