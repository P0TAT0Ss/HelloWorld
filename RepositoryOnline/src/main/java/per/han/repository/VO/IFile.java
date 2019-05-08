package per.han.repository.VO;

import javafx.util.Builder;

public class IFile {
    private final long   id;
    private final String name;
    private final String type;
    private final String size;
    private final byte[] stream;
    private final String create_at;
    private final String update_at;
    private final String uploader;

    private IFile(builder builder) {
        id = builder.id;
        name = builder.name;
        type = builder.type;
        size = builder.size;
        stream = builder.stream;
        create_at = builder.create_at;
        update_at = builder.update_at;
        uploader = builder.uploader;
    }

    public static class builder implements Builder {

        private long   id;
        private String name;
        private String type;
        private String size;
        private byte[] stream;
        private String create_at;
        private String update_at;
        private String uploader;

        public builder id(long aId) { id = aId; return this; }

        public builder name(String aName) { name = aName; return this; }

        public builder type(String aType) { type = aType; return this; }

        public builder size(String aSize) { size = aSize; return this; }

        public builder stream(byte[] aStream) { stream = aStream; return this; }

        public builder create_at(String timeCreate) { create_at = timeCreate; return this; }

        public builder update_at(String timeUpdate) { update_at = timeUpdate; return this; }

        public builder uploader(String aUploader) { uploader = aUploader; return this; }

        @Override
        public IFile build() {
            return new IFile(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public byte[] getStream() {
        return stream;
    }

    public String getCreate_at() {
        return create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public String getUploader() {
        return uploader;
    }

    @Override
    public String toString() {
        return getName() + getType() + getSize() + getUploader() + getCreate_at();
    }
}
