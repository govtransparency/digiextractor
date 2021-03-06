package com.precognox.digiwhist.output.ocds;


import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * OCDS identifier. This object doesn't cover full OCDS schema.
 * 
 * @see <a href="http://standard.open-contracting.org/1.1/en/schema/release/">OCDS Release Schema</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OCDSIdentifier {

    private String id;

    private String scheme;

    /**
     * @return id
     */
    public final String getId() {
        return id;
    }

    /**
     * @param id
     *      id to be set
     * @return this instance for chaining
     */
    public final OCDSIdentifier setId(final String id) {
        this.id = id;
        return this;
    }

    /**
     * @return scheme
     */
    public final String getScheme() {
        return scheme;
    }

    /**
     * @param scheme
     *      scheme to be set
     * @return this instance for chaining
     */
    public final OCDSIdentifier setScheme(final String scheme) {
        this.scheme = scheme;
        return this;
    }
}
