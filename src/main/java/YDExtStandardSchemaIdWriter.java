/**
 * @(#)YDExtStandardSchemaIdWriter, 16/8/16.
 * <p/>
 * Copyright 2016 Yodao, Inc. All rights reserved.
 * YODAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.openrtb.json.OpenRtbJsonExtWriter;

import java.io.IOException;

/**
 * @author panpengfei.
 * @version 1.0.0
 */
public class YDExtStandardSchemaIdWriter extends OpenRtbJsonExtWriter<Integer> {

    @Override
    protected void write(Integer ext, JsonGenerator gen) throws IOException {
        gen.writeNumberField(Constants.EXTEND_STANDARD_SCHEMA_ID_FIELD_NAME, ext);
    }
}
