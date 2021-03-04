package com.utour.common.contrants;

import com.utour.common.EnumValue;

/**
 * Entity 관련 상수
 */
public interface EntityConstants {

    enum BoardType {
        NOTICE, QNA, REVIEW
    }

    enum ImageType {
        THUMBNAIL,
        REPRESENT,
        OTHER
    }

    enum ProductType {
        HOTEL, AIR, SCUBA
    }
}
