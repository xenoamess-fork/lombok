import java.util.Set;
import java.util.SortedSet;
class BuilderSingularSetsWithSetterPrefix<T> {
	private Set<T> dangerMice;
	private SortedSet<? extends Number> octopodes;
	@SuppressWarnings("all")
	private Set rawSet;
	private Set<String> stringSet;
	@java.lang.SuppressWarnings("all")
	BuilderSingularSetsWithSetterPrefix(final Set<T> dangerMice, final SortedSet<? extends Number> octopodes, final Set rawSet, final Set<String> stringSet) {
		this.dangerMice = dangerMice;
		this.octopodes = octopodes;
		this.rawSet = rawSet;
		this.stringSet = stringSet;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderSingularSetsWithSetterPrefixBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<T> dangerMice;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<Number> octopodes;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<java.lang.Object> rawSet;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<String> stringSet;
		@java.lang.SuppressWarnings("all")
		BuilderSingularSetsWithSetterPrefixBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withDangerMouse(final T dangerMouse) {
			if (this.dangerMice == null) this.dangerMice = new java.util.ArrayList<T>();
			this.dangerMice.add(dangerMouse);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withDangerMice(final java.util.Collection<? extends T> dangerMice) {
			if (dangerMice == null) {
				throw new java.lang.NullPointerException("dangerMice cannot be null");
			}
			if (this.dangerMice == null) this.dangerMice = new java.util.ArrayList<T>();
			this.dangerMice.addAll(dangerMice);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> clearDangerMice() {
			if (this.dangerMice != null) this.dangerMice.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withOctopus(final Number octopus) {
			if (this.octopodes == null) this.octopodes = new java.util.ArrayList<Number>();
			this.octopodes.add(octopus);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withOctopodes(final java.util.Collection<? extends Number> octopodes) {
			if (octopodes == null) {
				throw new java.lang.NullPointerException("octopodes cannot be null");
			}
			if (this.octopodes == null) this.octopodes = new java.util.ArrayList<Number>();
			this.octopodes.addAll(octopodes);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> clearOctopodes() {
			if (this.octopodes != null) this.octopodes.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withRawSet(final java.lang.Object rawSet) {
			if (this.rawSet == null) this.rawSet = new java.util.ArrayList<java.lang.Object>();
			this.rawSet.add(rawSet);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withRawSet(final java.util.Collection<?> rawSet) {
			if (rawSet == null) {
				throw new java.lang.NullPointerException("rawSet cannot be null");
			}
			if (this.rawSet == null) this.rawSet = new java.util.ArrayList<java.lang.Object>();
			this.rawSet.addAll(rawSet);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> clearRawSet() {
			if (this.rawSet != null) this.rawSet.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withStringSet(final String stringSet) {
			if (this.stringSet == null) this.stringSet = new java.util.ArrayList<String>();
			this.stringSet.add(stringSet);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> withStringSet(final java.util.Collection<? extends String> stringSet) {
			if (stringSet == null) {
				throw new java.lang.NullPointerException("stringSet cannot be null");
			}
			if (this.stringSet == null) this.stringSet = new java.util.ArrayList<String>();
			this.stringSet.addAll(stringSet);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> clearStringSet() {
			if (this.stringSet != null) this.stringSet.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularSetsWithSetterPrefix<T> build() {
			java.util.Set<T> dangerMice;
			switch (this.dangerMice == null ? 0 : this.dangerMice.size()) {
			case 0: 
				dangerMice = java.util.Collections.emptySet();
				break;
			case 1: 
				dangerMice = java.util.Collections.singleton(this.dangerMice.get(0));
				break;
			default: 
				dangerMice = new java.util.LinkedHashSet<T>(this.dangerMice.size() < 1073741824 ? 1 + this.dangerMice.size() + (this.dangerMice.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				dangerMice.addAll(this.dangerMice);
				dangerMice = java.util.Collections.unmodifiableSet(dangerMice);
			}
			java.util.SortedSet<Number> octopodes = new java.util.TreeSet<Number>();
			if (this.octopodes != null) octopodes.addAll(this.octopodes);
			octopodes = java.util.Collections.unmodifiableSortedSet(octopodes);
			java.util.Set<java.lang.Object> rawSet;
			switch (this.rawSet == null ? 0 : this.rawSet.size()) {
			case 0: 
				rawSet = java.util.Collections.emptySet();
				break;
			case 1: 
				rawSet = java.util.Collections.singleton(this.rawSet.get(0));
				break;
			default: 
				rawSet = new java.util.LinkedHashSet<java.lang.Object>(this.rawSet.size() < 1073741824 ? 1 + this.rawSet.size() + (this.rawSet.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				rawSet.addAll(this.rawSet);
				rawSet = java.util.Collections.unmodifiableSet(rawSet);
			}
			java.util.Set<String> stringSet;
			switch (this.stringSet == null ? 0 : this.stringSet.size()) {
			case 0: 
				stringSet = java.util.Collections.emptySet();
				break;
			case 1: 
				stringSet = java.util.Collections.singleton(this.stringSet.get(0));
				break;
			default: 
				stringSet = new java.util.LinkedHashSet<String>(this.stringSet.size() < 1073741824 ? 1 + this.stringSet.size() + (this.stringSet.size() - 3) / 3 : java.lang.Integer.MAX_VALUE);
				stringSet.addAll(this.stringSet);
				stringSet = java.util.Collections.unmodifiableSet(stringSet);
			}
			return new BuilderSingularSetsWithSetterPrefix<T>(dangerMice, octopodes, rawSet, stringSet);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder(dangerMice=" + this.dangerMice + ", octopodes=" + this.octopodes + ", rawSet=" + this.rawSet + ", stringSet=" + this.stringSet + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <T> BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T> builder() {
		return new BuilderSingularSetsWithSetterPrefix.BuilderSingularSetsWithSetterPrefixBuilder<T>();
	}
}