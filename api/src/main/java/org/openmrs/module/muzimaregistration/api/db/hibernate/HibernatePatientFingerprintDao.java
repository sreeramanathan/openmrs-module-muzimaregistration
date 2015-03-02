/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.muzimaregistration.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.module.muzima.api.db.hibernate.HibernateSingleClassDao;
import org.openmrs.module.muzimaregistration.api.db.PatientFingerprintDao;
import org.openmrs.module.muzimaregistration.api.model.PatientFingerprint;
import org.springframework.transaction.annotation.Transactional;

/**
 * It is a default implementation of  {@link org.openmrs.module.muzimaregistration.api.db.RegistrationDataDao}.
 */
public class HibernatePatientFingerprintDao extends HibernateSingleClassDao<PatientFingerprint> implements PatientFingerprintDao {

    private final Log log = LogFactory.getLog(this.getClass());

    public HibernatePatientFingerprintDao() {
        super(PatientFingerprint.class);
    }

    /**
     * @return the sessionFactory
     */
    protected SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    @Transactional
    public PatientFingerprint savePatientFingerprint(final PatientFingerprint patientFingerprint) {
        return saveOrUpdate(patientFingerprint);
    }

}