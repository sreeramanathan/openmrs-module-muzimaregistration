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
package org.openmrs.module.muzimaregistration.api.impl;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.APIException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.muzimaregistration.api.PatientFingerprintService;
import org.openmrs.module.muzimaregistration.api.RegistrationDataService;
import org.openmrs.module.muzimaregistration.api.db.PatientFingerprintDao;
import org.openmrs.module.muzimaregistration.api.db.RegistrationDataDao;
import org.openmrs.module.muzimaregistration.api.model.PatientFingerprint;
import org.openmrs.module.muzimaregistration.api.model.RegistrationData;

import java.util.List;

/**
 * It is a default implementation of {@link org.openmrs.module.muzimaregistration.api.RegistrationDataService}.
 */
public class PatientFingerprintServiceImpl extends BaseOpenmrsService implements PatientFingerprintService {

    private final Log log = LogFactory.getLog(this.getClass());

    private PatientFingerprintDao dao;

    /**
     * @param dao the dao to set
     */
    public void setDao(PatientFingerprintDao dao) {
        this.dao = dao;
    }

    /**
     * @return the dao
     */
    public PatientFingerprintDao getDao() {
        return dao;
    }

    @Override
    public PatientFingerprint savePatientFingerprint(final PatientFingerprint patientFingerprint) {
        return dao.savePatientFingerprint(patientFingerprint);
    }

}