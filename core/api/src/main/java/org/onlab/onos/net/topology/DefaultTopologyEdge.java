package org.onlab.onos.net.topology;

import org.onlab.onos.net.Link;

import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;

/**
 * Implementation of the topology edge backed by a link.
 */
public class DefaultTopologyEdge implements TopologyEdge {

    private final Link link;
    private final TopologyVertex src;
    private final TopologyVertex dst;

    /**
     * Creates a new topology edge.
     *
     * @param src  source vertex
     * @param dst  destination vertex
     * @param link infrastructure link
     */
    public DefaultTopologyEdge(TopologyVertex src, TopologyVertex dst, Link link) {
        this.src = src;
        this.dst = dst;
        this.link = link;
    }

    @Override
    public Link link() {
        return link;
    }

    @Override
    public TopologyVertex src() {
        return src;
    }

    @Override
    public TopologyVertex dst() {
        return dst;
    }

    @Override
    public int hashCode() {
        return Objects.hash(link);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultTopologyEdge) {
            final DefaultTopologyEdge other = (DefaultTopologyEdge) obj;
            return Objects.equals(this.link, other.link);
        }
        return false;
    }

    @Override
    public String toString() {
        return toStringHelper(this).add("src", src).add("dst", dst).toString();
    }

}

