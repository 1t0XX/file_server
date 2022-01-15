import java.util.Iterator;

class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    @Override
    public Iterator<Long> iterator() {
        return new RangeIterator();
    }

    private class RangeIterator implements Iterator<Long>{

        private long cursor;

        public RangeIterator(){
            this.cursor = Range.this.fromInclusive;
        }

        @Override
        public boolean hasNext(){
            return this.cursor < Range.this.toExclusive;
        }

        @Override
        public Long next(){
            if (this.hasNext()){
                long currentElement = cursor;
                cursor++;
                return currentElement;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
}
